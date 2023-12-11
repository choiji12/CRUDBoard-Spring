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
@RequestMapping("/board/*") //localhost:port/board/*~~~~
public class BoardController {
	
	@Inject
	private BoardService service;
	
	@RequestMapping(value ="/register" , method = RequestMethod.GET)//localhost:port/board/register
	public String registerGET(BoardVO board, Model model) throws Exception{
		System.out.println("Register (GET) called");
		return "/board/register2"; // -> /board/register.jsp
	}
	
	
	@RequestMapping(value ="/register" , method = RequestMethod.POST)//localhost:port/board/register
	public String registerPOST(BoardVO board, RedirectAttributes rttr) throws Exception{
		System.out.println("Register (POST) called");
		System.out.println("제목:" +board.getTitle());
		System.out.println("내용:" +board.getContent());
		System.out.println("글쓴이:"+board.getWriter());
		service.regist(board);
		return "redirect:/board/listAll";
		}
	
	
	
	
	//boalistAll	
	@RequestMapping(value ="/listAll" , method = RequestMethod.GET)
	public String listAll(Model model) throws Exception{
		System.out.println("Called listAll page (GET)");							
		model.addAttribute("list",service.listAll());		
		return "/board/listAll7"; // 
			
	}
	//board/read
	@RequestMapping(value ="/read" , method = RequestMethod.GET)
	public String read(@RequestParam("bno")int bno, Model model) throws Exception{
		System.out.println("Called Read page (GET)");
		System.out.println("bno = "+ bno);
		model.addAttribute(service.read(bno));
		return "/board/read7"; // 
			
	}
	//board/modify
	
	@RequestMapping(value ="/modify" , method = RequestMethod.GET)
	public String modifyGET(@RequestParam("bno")int bno, Model model) throws Exception{
		System.out.println("Called Modify page (GET)");
		System.out.println("bno = "+ bno);
		model.addAttribute(service.read(bno));
		return "/board/modify3"; //modify.jsp 
			
	}
	
	//board/modify
	@RequestMapping(value ="/modify" , method = RequestMethod.POST)
	public String modifyPOST(BoardVO board,RedirectAttributes rttr) throws Exception{
		System.out.println("Called Modify page (POST)");
		System.out.println("bno = "+ board.getBno());
		System.out.println("title = "+ board.getTitle());
		System.out.println("content = "+ board.getContent());
		System.out.println("writer = "+ board.getWriter());

		
		service.modify(board);
		return "redirect:/board/listAll";
			
	}
	
	//board/remove
	
		@RequestMapping(value ="/remove" , method = RequestMethod.GET)
		public String removeGET(@RequestParam("bno")int bno,RedirectAttributes rttr) throws Exception{
			System.out.println("Called Remove page (GET)");
			System.out.println("bno = "+ bno);
			service.remove(bno);
			return "redirect:/board/listAll";
			
				
		}
		
//		//boalistAll	
//		@RequestMapping(value ="/listPage" , method = RequestMethod.GET)
//		public String listPage(Model model) throws Exception{
//			System.out.println("Called listPage page (GET)");							
//			model.addAttribute("list",service.listPage(3));		
//			return "/board/listAll7"; // 
//				
//		}
//		
//		//boalistCri	
//				@RequestMapping(value ="/listCri" , method = RequestMethod.GET)
//				public String listCri(Criteria crl,Model model) throws Exception{
//					System.out.println("Called listCri page (GET)");							
//					model.addAttribute("list",service.listCriteria(crl));		
//					return "/board/listAll7"; // 
//						
//				}
					
		@RequestMapping(value ="/listPage" , method = RequestMethod.GET)
		public String listPage(@ModelAttribute("cri") Criteria cri, Model model) throws Exception{
			System.out.println("Called listPage pagesds (GET)" + service.TotalDataCount());							
			model.addAttribute("list",service.listCriteria(cri));
			PageMaker pageMaker= new PageMaker();
			pageMaker.setCri(cri);
			pageMaker.setTotalCount(service.TotalDataCount());
			model.addAttribute("pageMaker", pageMaker);
			
			///return "/board/listAll7"; // 
			return "/board/listPage";
		}
		
		//board/read
		@RequestMapping(value ="/readPage" , method = RequestMethod.GET)
		public String readPage(@RequestParam("bno")int bno,@ModelAttribute("cri") Criteria cri, Model model) throws Exception{
			System.out.println("Called Read page (GET)");
			System.out.println("bno = "+ bno);
			model.addAttribute(service.read(bno));
			return "/board/readPage"; // 
				
		}
		
		
		
		@RequestMapping(value ="/modifyPage" , method = RequestMethod.GET)
		public String modifyPageGET(@RequestParam("bno")int bno,@ModelAttribute("cri") Criteria cri, Model model) throws Exception{
			System.out.println("Called Modify page (GET)");
			System.out.println("bno = "+ bno);
			model.addAttribute(service.read(bno));
			return "/board/modifyPage"; //modify.jsp 
				
		}
		
		@RequestMapping(value ="/modifyPage" , method = RequestMethod.POST)
		public String modifyPage(BoardVO board,@ModelAttribute("cri") Criteria cri, RedirectAttributes rttr) throws Exception{
			System.out.println("Called Modify page (POST)");
		
			service.modify(board);
			rttr.addAttribute("page", cri.getPage());
			rttr.addAttribute("perPageNum", cri.getPerPageNum());
			return "redirect:/board/listPage";
				
		}
			
		@RequestMapping(value ="/removePage" , method = RequestMethod.POST)
		public String removePagePOST(@RequestParam("bno")int bno, @ModelAttribute("cri") Criteria cri, RedirectAttributes rttr) throws Exception{
			System.out.println("Called Remove page (GET)");
			System.out.println("bno = "+ bno);
			rttr.addAttribute("page", cri.getPage());
			rttr.addAttribute("perPageNum", cri.getPerPageNum());
			service.remove(bno);
			return "redirect:/board/listPage";
			
				
		}
	
}
