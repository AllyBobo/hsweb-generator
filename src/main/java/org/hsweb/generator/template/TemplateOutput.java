package org.hsweb.generator.template;


import org.hsweb.generator.CodeTemplate;

/**
 * ģ������ӿڣ�ͨ���˽ӿڣ���ģ�������
 * Created by �� on 2016-03-17 0017.
 */
public interface TemplateOutput {
    void output();

    void setTemplate(CodeTemplate template);
}
