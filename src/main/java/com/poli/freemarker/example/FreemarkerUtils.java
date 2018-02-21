package com.poli.freemarker.example;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import freemarker.template.Configuration;
import freemarker.template.DefaultObjectWrapper;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Map;

/**
 *
 * @author poliana
 */
public class FreemarkerUtils {

    private static Configuration cfg = new Configuration();
    private static final String TEMPLATES_FOLDER = "/src/main/resources/templates";
    private static final String PATH = System.getProperty("user.dir");

    public static final String parseTemplate(Map map, String templateName) throws TemplateException, IOException {

        //diretório onde estão templates
        cfg.setDirectoryForTemplateLoading(new File(PATH + TEMPLATES_FOLDER));
        cfg.setObjectWrapper(new DefaultObjectWrapper());

        //  ;
        //recupera o template
        Template template = cfg.getTemplate(templateName);
        StringWriter writer = new StringWriter();

        // processa o freemarker
        template.process(map, writer);

        writer.flush();
        writer.close();

        return writer.toString();
    }

}
