package cn.bdqn.tangcco.lookwell.chapter.service;

import cn.bdqn.tangcco.lookwell.entity.Chapter;

import java.util.List;

/**
 * Created by Administrator on 2017/8/8.
 */
public interface ChapterService {
    public List<Chapter> QueryAllChapter();

    public Chapter QueryChapterById(Integer Id);

    public Integer AddChapter(Chapter chapter);

    public Integer UpdateChapter(Chapter chapter);
}
