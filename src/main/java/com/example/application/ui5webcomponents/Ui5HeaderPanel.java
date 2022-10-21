package com.example.application.ui5webcomponents;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.HasComponents;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;
import com.vaadin.flow.dom.Element;

@Tag("furo-ui5-header-panel")
@NpmPackage(value = "@furo/ui5", version = "^1.13.0")
@JsModule("@furo/ui5/src/furo-ui5-header-panel.js")
public class Ui5HeaderPanel extends Component implements HasComponents {

   public void setHeaderText(String headerText) {
      this.getElement().setProperty("headerText", headerText);
   }

   public void setSecondaryText(String secondaryText) {
      this.getElement().setProperty("secondaryText", secondaryText);
   }

   public void setCollapsed(Boolean collapsed) {
      this.getElement().setProperty("collapsed", collapsed);
   }

   public void setIcon(String icon) {
      this.getElement().setProperty("icon", icon);
   }

   public void addToAction(Component... components) {
      Component[] var2 = components;
      int var3 = components.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         Component component = var2[var4];
         component.getElement().setAttribute("slot", "action");
         this.getElement().appendChild(new Element[]{component.getElement()});
      }

   }
}
