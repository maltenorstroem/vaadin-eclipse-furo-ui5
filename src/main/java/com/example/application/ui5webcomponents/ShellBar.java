package com.example.application.ui5webcomponents;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.HasComponents;
import com.vaadin.flow.component.HasLabel;
import com.vaadin.flow.component.HasSize;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;

@Tag("ui5-shellbar")
@NpmPackage(value = "@ui5/webcomponents-fiori", version = "^1.8.0")
@JsModule("@ui5/webcomponents-fiori/dist/ShellBar.js")
public class ShellBar extends Component implements HasComponents, HasLabel, HasSize {

   public void setPrimaryTitle(String title) {
      this.getElement().setProperty("primaryTitle", title);
   }

}
