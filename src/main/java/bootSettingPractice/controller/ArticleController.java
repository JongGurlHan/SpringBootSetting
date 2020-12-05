package bootSettingPractice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import bootSettingPractice.dto.Article;
import bootSettingPractice.service.ArticleService;

@Controller
public class ArticleController {
	
	@Autowired
	private ArticleService articleService;

	@RequestMapping("/article/list")
	@ResponseBody
	public List<Article> showList() {
		List<Article>articles = articleService.getArticles();
		
		return articles;
		//return "article/list";
	}
}