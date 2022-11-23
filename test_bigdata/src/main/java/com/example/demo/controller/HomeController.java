package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	@GetMapping(path = "/main")
	public String main(Model model) {
	    return "index";
	}
	
//	@Autowired
//	private MemberService memberService;
//	@GetMapping("/")
//	public String home() {
//		return "home";
//	}
//	@GetMapping("/join")
//	public String join() {
//		return "join";
//	}
//	@PostMapping("/join")
//	public String join(JpaMember member) {
//		memberService.save(member);
//		return "redirect:list";
//	}
//	//전체보기 (페이징없음)
//	/*
//	 * @GetMapping("/list") public String list(Model model) {
//	 * List<JpaMember>members=memberService.list(); model.addAttribute("lists",
//	 * members); return "list"; }
//	 */
//	//전체보기(페이징 있음)
//	@GetMapping("/list")
//	public String list(Model model, @PageableDefault(size=3, sort ="id", direction= Sort.Direction.DESC)Pageable pageable) {
//		System.out.println("pageable: " +pageable);
//		Page<JpaMember>lists = memberService.list(pageable);
//		model.addAttribute("lists", lists);
//		return "list";
//	}
//	//상세보기
//	@GetMapping("/detail/{id}")
//	public String detail(@PathVariable Long id, Model model) {
//		model.addAttribute("member",memberService.detail(id));
//		
//		return "detail";
//	}
//	//상세보기 2
//		@ResponseBody
//		@GetMapping("/detail2/{id}")
//		public JpaMember detail2(@PathVariable Long id) {
//			
//			return memberService.detail(id);
//		}
//	//삭제하기
//	@ResponseBody
//	@DeleteMapping("/delete/{id}")
//	public Long delete(@PathVariable Long id) {
//		memberService.delete(id);
//		return id;
//	}
//	//update 수정 폼으로 이동
//	@GetMapping("/update/{id}")
//	public String update(@PathVariable Long id, Model model){
//		model.addAttribute("member", memberService.detail(id));
//		return "update";
//	}
//	//수정하기
//	@PutMapping("update")
//	@ResponseBody
//	public String update(@RequestBody JpaMember member){
//		System.out.println("addr:"+member.getAddr());
//		System.out.println("email:"+member.getEmail());
//		System.out.println("id:"+member.getId());
//		memberService.update(member);
//		return "success";
//	}
	
	
}