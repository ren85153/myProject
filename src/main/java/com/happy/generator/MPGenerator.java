package com.happy.generator;


import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.DbType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

/**
 * 
 * @description:MP代码生成器
 */
public class MPGenerator {
    
    public static void main(String[] args) {
        //创建代码生成器
        AutoGenerator mpg = new AutoGenerator();
        //指定模板引擎  默认velocity 
        //mpg.setTemplateEngine(new FreemarkerTemplateEngine());
        
        //全局配置
        GlobalConfig gc = new GlobalConfig();
        gc.setOpen(false);
        gc.setOutputDir("D:\\WorkSpace\\sts-space\\myProject\\src\\main\\java");
        gc.setFileOverride(true); //是否覆盖已有文件
        gc.setBaseResultMap(true); //XML是否需要BaseResultMap
        gc.setBaseColumnList(true); //XML是否显示字段
        gc.setControllerName("%sController");
        gc.setServiceName("%sService");
        gc.setServiceImplName("%sServiceImpl");
        gc.setMapperName("%sMapper");
        gc.setXmlName("%sMapper");
        gc.setAuthor("yanghui");
        gc.setIdType(IdType.AUTO);
        mpg.setGlobalConfig(gc);    
        //数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setDbType(DbType.MYSQL);
        dsc.setDriverName("com.mysql.jdbc.Driver");
        dsc.setUrl("jdbc:mysql://127.0.0.1:3306/study?characterEncoding=utf8&useSSL=false");
        dsc.setUsername("root");
        dsc.setPassword("123456");
        mpg.setDataSource(dsc);
        //策略配置
        StrategyConfig sc = new StrategyConfig();
        sc.setTablePrefix("sys_"); //表名前缀
        sc.setNaming(NamingStrategy.underline_to_camel); //表名生成策略 
        sc.setEntityBuilderModel(true);
//        sc.setEntityLombokModel(true);
        mpg.setStrategy(sc);
        //包配置
        PackageConfig pc = new PackageConfig();
        pc.setParent("com.happy");
        pc.setEntity("entity");
        pc.setController("controller");
        pc.setService("service");
        pc.setServiceImpl("serviceImpl");
        pc.setMapper("mapper");
        pc.setXml("mapper");
        mpg.setPackageInfo(pc);
    
        mpg.execute();
    }

}