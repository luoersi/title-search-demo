package com.caoruiqun.search.web;

import com.caoruiqun.search.common.CountData;
import com.caoruiqun.search.common.KWSeeker;
import com.caoruiqun.search.common.SensitiveText;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Controller
public class TestController {

    @RequestMapping("/")
    public String testApp(Model model) throws Exception {
        Set<SensitiveText> sensitiveTexts = new HashSet<SensitiveText>();
        sensitiveTexts.add(new SensitiveText("我爱北京"));
        sensitiveTexts.add(new SensitiveText("我爱到家"));
        sensitiveTexts.add(new SensitiveText("到家美好"));
        sensitiveTexts.add(new SensitiveText("我的家"));
        sensitiveTexts.add(new SensitiveText("梁浩明"));
        sensitiveTexts.add(new SensitiveText("梁艾利"));
        sensitiveTexts.add(new SensitiveText("梁乔"));
        sensitiveTexts.add(new SensitiveText("梁璐璐"));
        sensitiveTexts.add(new SensitiveText("孙秀田"));
        sensitiveTexts.add(new SensitiveText("孙绿田"));
        sensitiveTexts.add(new SensitiveText("孙秀秀"));
        sensitiveTexts.add(new SensitiveText("李秀田"));
        sensitiveTexts.add(new SensitiveText("孙伟航"));
        sensitiveTexts.add(new SensitiveText("孙中山"));
        sensitiveTexts.add(new SensitiveText("杨超普"));
        sensitiveTexts.add(new SensitiveText("杨颖"));
        sensitiveTexts.add(new SensitiveText("杨广"));
        sensitiveTexts.add(new SensitiveText("周世杰"));
        sensitiveTexts.add(new SensitiveText("周恩来"));
        sensitiveTexts.add(new SensitiveText("李亚兴"));
        sensitiveTexts.add(new SensitiveText("李世民"));
        sensitiveTexts.add(new SensitiveText("胡月"));
        sensitiveTexts.add(new SensitiveText("夏鑫鑫"));
        sensitiveTexts.add(new SensitiveText("毛泽东"));
        sensitiveTexts.add(new SensitiveText("邓小平"));
        sensitiveTexts.add(new SensitiveText("Billy Leung"));
        sensitiveTexts.add(new SensitiveText("Alice Leung"));
        sensitiveTexts.add(new SensitiveText("Mao zedong"));
        sensitiveTexts.add(new SensitiveText("sun xiutian"));
        sensitiveTexts.add(new SensitiveText("sun xiuxiu"));
        sensitiveTexts.add(new SensitiveText("li xiutian"));
        sensitiveTexts.add(new SensitiveText("sun weihang"));
        sensitiveTexts.add(new SensitiveText("sun zhongshan"));

        KWSeeker kws = new KWSeeker(sensitiveTexts);
//        System.out.println("简易文本检索器--》");
//        System.out.println("词库数据：" + sensitiveTexts);

        // 搜索
        List<CountData> list = kws.search("孙sun", 10);

//        System.out.println("结果高亮\t命中关键字次数\t所有命中关键字位置");
        for (CountData data : list) {
            // System.out.println(data.result() + "\t" + data.getCount());
            System.out.println(data.result() + "\t" + data.getCount() + "\t" + data.getWords());
        }

        model.addAttribute("list", list);
        return "result";
    }

}
