package cn.rjguanwen.booklib.util;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @ClassName: GeneratorCodeUtil
 * @Description: TODO
 * @Author: 郑斌
 * @Date: 2019/5/9 19:57
 **/
public class GeneratorCodeUtil {
    private static Logger logger=LoggerFactory.getLogger(GeneratorCodeUtil.class);

    public static void main(String[] args) {
        List<String> warnings = new ArrayList<String>();
        boolean overwrite = true;
        //配置文件路径（可看结构图）
        String genCfg = "/generator/generatorConfig-book_in_one.xml";
        File configFile = new File(GeneratorCodeUtil.class.getResource(genCfg).getFile());
        logger.info("读取配置资源："+configFile.toPath());
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = null;
        try {
            config = cp.parseConfiguration(configFile);
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("代码生成出现异常");
        }
        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        try {
            MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
            myBatisGenerator.generate(null);
            logger.info("代码生成成功");
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("代码生成异常");
        }
    }
}
