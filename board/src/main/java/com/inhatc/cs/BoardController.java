package com.inhatc.cs;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.inhatc.domain.BoardVO;
import com.inhatc.domain.Criteria;
import com.inhatc.domain.PageMaker;
import com.inhatc.service.BoardService;

@Controller
@RequestMapping("/board/*")
public class BoardController {


  @Inject
  private BoardService service;

  @RequestMapping(value = "/register", method = RequestMethod.GET)
  public void registerGET(BoardVO board, Model model) throws Exception {
       System.out.println("register get ...........");
       //return "register";
  }
  
  @RequestMapping(value = "/register1", method = RequestMethod.GET)
  public void register1GET(BoardVO board, Model model) throws Exception {
      System.out.println("register get ...........");
      //return "register";
  }

  @RequestMapping(value = "/register", method = RequestMethod.POST)
  public String registPOST(BoardVO board, Model model) throws Exception {
  	  System.out.println("regist post ...........");
	  System.out.println(board.toString());
	  service.regist(board);
	  model.addAttribute("result", "success");
	  return "/board/success";
	  // return "redirect:/board/listAll";
  }


  @RequestMapping(value = "/listAll", method = RequestMethod.GET)
  public void listAll(Model model) throws Exception {
	  System.out.println("show all list......................");
	  model.addAttribute("list", service.listAll());
  }

  @RequestMapping(value = "/read", method = RequestMethod.GET)
  public void read(@RequestParam("bno") int bno, Model model) throws Exception {
	  model.addAttribute(service.read(bno));
  }

  @RequestMapping(value = "/remove", method = RequestMethod.POST)
  public String remove(@RequestParam("bno") int bno, RedirectAttributes rttr) throws Exception {
	  service.remove(bno);
	  rttr.addFlashAttribute("msg", "SUCCESS");
	  return "redirect:/board/listAll";
  }

  @RequestMapping(value = "/modify", method = RequestMethod.GET)
  public void modifyGET(int bno, Model model) throws Exception {
	  model.addAttribute(service.read(bno));
  }

  @RequestMapping(value = "/modify", method = RequestMethod.POST)
  public String modifyPOST(BoardVO board, RedirectAttributes rttr) throws Exception {
	  service.modify(board);
	  rttr.addFlashAttribute("msg", "SUCCESS");
	  return "redirect:/board/listAll";
  }

  @RequestMapping(value = "/listCri", method = RequestMethod.GET)
  public void listAll(Criteria cri, Model model) throws Exception {
	  System.out.println("show list Page with Criteria......................");
	  model.addAttribute("list", service.listCriteria(cri));
  }
  
  @RequestMapping(value = "/listPage", method = RequestMethod.GET)
  public void listPage(@ModelAttribute("cri") Criteria cri, Model model) throws Exception {
	  System.out.println(cri.toString());
	  model.addAttribute("list", service.listCriteria(cri));
      PageMaker pageMaker = new PageMaker();
      pageMaker.setCri(cri);
      // pageMaker.setTotalCount(131);
      pageMaker.setTotalCount(service.listCountCriteria(cri));
      model.addAttribute("pageMaker", pageMaker);
  }

  @RequestMapping(value = "/readPage", method = RequestMethod.GET)
  public void read(@RequestParam("bno") int bno, @ModelAttribute("cri") Criteria cri, Model model) throws Exception {
	  model.addAttribute(service.read(bno));
  }

  @RequestMapping(value = "/removePage", method = RequestMethod.POST)
  public String remove(@RequestParam("bno") int bno, Criteria cri, RedirectAttributes rttr) throws Exception {
	  service.remove(bno);
	  rttr.addAttribute("page", cri.getPage());
	  rttr.addAttribute("perPageNum", cri.getPerPageNum());
	  rttr.addFlashAttribute("msg", "SUCCESS");
	  return "redirect:/board/listPage";
  }

  @RequestMapping(value = "/modifyPage", method = RequestMethod.GET)
  public void modifyPagingGET(@RequestParam("bno") int bno, @ModelAttribute("cri") Criteria cri, Model model) throws Exception {
	  model.addAttribute(service.read(bno));
  }
  
  @RequestMapping(value = "/modifyPage", method = RequestMethod.POST)
  public String modifyPagePOST(BoardVO board, Criteria cri, RedirectAttributes rttr) throws Exception {
	  System.out.println("mod post............");
	  service.modify(board);
	  rttr.addAttribute("page", cri.getPage());
	  rttr.addAttribute("perPageNum", cri.getPerPageNum());
	  rttr.addFlashAttribute("msg", "SUCCESS");
	  return "redirect:/board/listPage";
  }
}
