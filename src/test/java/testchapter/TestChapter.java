package testchapter;

import base.TestBase;
import cn.bdqn.tangcco.lookwell.chapter.service.ChapterService;
import cn.bdqn.tangcco.lookwell.entity.Chapter;
import cn.bdqn.tangcco.lookwell.entity.Course;
import org.junit.Test;


import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2017/8/8.
 */
public class TestChapter extends TestBase{
    @Resource
    private ChapterService chapterService;

    @Test
    public void testQueryAllChapter() {
        List<Chapter> list = chapterService.QueryAllChapter();
        for (int i=0;i<list.size();i++) {
            System.out.println(list.get(i));
        }
    }

    @Test
    public void testQueryChapterById() {
        System.out.println(chapterService.QueryChapterById(1));
    }

    @Test
    public void testAddChapter() {
        Chapter chapter = new Chapter();
        chapter.setChapterName("这个是新增章节");
        chapter.setDuration(1);
        Course course = new Course();
        course.setCourseId(1);
        chapter.setCourse(course);
        Integer count=chapterService.AddChapter(chapter);
        System.out.println("新增行数是=================================>"+count);
    }

    @Test
    public void testUpdateChapter() {
        Chapter chapter = new Chapter();
        Course course = new Course();
        chapter.setChapterName("这个是修改章节");
        chapter.setDuration(2);
        course.setCourseId(2);
        chapter.setCourse(course);
        chapter.setChapterId(3);
        Integer count=chapterService.UpdateChapter(chapter);
        System.out.println("修改行数是===================================>"+count);
    }
}
