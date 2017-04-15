package cn.vivewang.blog.controler;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.vivewang.blog.bean.UserBean;
import cn.vivewang.blog.service.ILoginService;

@Controller
public class HelloControler {
	@Resource
    private ILoginService loginServiceImpl;
	@RequestMapping("/123")
	public ModelAndView hello(String aaa) {
		System.out.println("aaa" + aaa);

		return null;
	}

	@RequestMapping("/login")
	public ModelAndView login(HttpServletRequest req, UserBean user) {

		ModelAndView mv = new ModelAndView();
		UserBean u = loginServiceImpl.Login(user.getUsername(),
				user.getPassword());

		if (u != null) {

			req.getSession().setAttribute("user", u);
			mv.addObject("password", u.getPassword());
			System.out.println(u.getPassword());
		}
		mv.setViewName("index");
		return mv;
	}

}
