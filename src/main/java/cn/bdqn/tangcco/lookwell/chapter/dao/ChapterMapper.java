package cn.bdqn.tangcco.lookwell.chapter.dao;

import cn.bdqn.tangcco.lookwell.entity.Chapter;


import java.util.List;

/**
 * Created by Administrator on 2017/8/8.
 */
public interface ChapterMapper {
    public List<Chapter> QueryAllChapter();

    public Chapter QueryChapterById(Integer Id);

    public Integer AddChapter(Chapter chapter);

    public Integer UpdateChapter(Chapter chapter);
}
