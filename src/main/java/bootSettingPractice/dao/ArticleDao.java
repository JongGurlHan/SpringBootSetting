package bootSettingPractice.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import bootSettingPractice.dto.Article;

@Mapper
public interface ArticleDao {

	List<Article> getArticles = null;

}
