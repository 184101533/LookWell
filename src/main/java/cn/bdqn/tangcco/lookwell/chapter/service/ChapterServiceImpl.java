package cn.bdqn.tangcco.lookwell.chapter.service;

import cn.bdqn.tangcco.lookwell.chapter.dao.ChapterMapper;
import cn.bdqn.tangcco.lookwell.entity.Chapter;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2017/8/8.
 */
@Service
public class ChapterServiceImpl implements ChapterService{
    @Resource
    private ChapterMapper chapterMapper;
    @Override
    public List<Chapter> QueryAllChapter() {
        return chapterMapper.QueryAllChapter();
    }

    @Override
    public Chapter QueryChapterById(Integer Id) {
        return chapterMapper.QueryChapterById(Id);
    }

    @Override
    public Integer AddChapter(Chapter chapter) {
        return chapterMapper.AddChapter(chapter);
    }

    @Override
    public Integer UpdateChapter(Chapter chapter) {
        return chapterMapper.UpdateChapter(chapter);
    }
}
