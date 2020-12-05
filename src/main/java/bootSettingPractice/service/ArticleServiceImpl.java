package bootSettingPractice.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bootSettingPractice.dao.ArticleDao;
import bootSettingPractice.dto.Article;

@Service
public class ArticleServiceImpl implements ArticleService{
	@Autowired
	private ArticleDao articleDao;

	@Override
	public List<Article> getArticles(){
		
		
		return articleDao.getArticles;
	}

}
