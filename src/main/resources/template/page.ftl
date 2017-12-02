package ${page.packageName};

import com.surenpi.autotest.webui.ui.Button;
import com.surenpi.autotest.webui.ui.Text;
import com.surenpi.autotest.webui.ui.Selector;
import com.surenpi.autotest.webui.ui.FileUpload;
import com.surenpi.autotest.webui.ui.CheckBoxGroup;

import org.suren.autotest.web.framework.annotation.AutoField;
import org.suren.autotest.web.framework.annotation.AutoPage;
import org.suren.autotest.web.framework.selenium.WebPage;

/**
 * Auto generate by phoenix. Visit me by http://surenpi.com
 * ${page.comment}
 * @author suren
 */
@AutoPage
public class ${page.name} extends WebPage {
<#list page.fields as field>
	/**
	 * ${field.comment}
	 */
	@AutoField
	private ${field.type} ${field.name};
</#list>
	/**
	 * getter and setter methods zone
	 */
<#list page.fields as field>
	public ${field.type} ${field.getterMethod}()
	{
		return ${field.name};
	}
	public void ${field.setterMethod}(${field.type} ${field.name})
	{
		this.${field.name} = ${field.name};
	}
</#list>
}
