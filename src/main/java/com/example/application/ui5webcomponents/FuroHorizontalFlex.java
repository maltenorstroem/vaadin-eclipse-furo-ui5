package com.example.application.ui5webcomponents;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.HasComponents;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;

@Tag("furo-horizontal-flex")
@NpmPackage(value = "@furo/layout", version = "^2.2.1")
@JsModule("@furo/layout/src/furo-horizontal-flex.js")
public class FuroHorizontalFlex extends Component implements HasComponents {

}
