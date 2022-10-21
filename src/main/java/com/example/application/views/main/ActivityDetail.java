package com.example.application.views.main;

import com.example.application.ui5webcomponents.ShellBar;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Activity Detail")
@Route("/activity")
public class ActivityDetail extends Div {

   public ActivityDetail(){

      ShellBar shellBar = new ShellBar();
      shellBar.setPrimaryTitle("Activity");

      add(shellBar);
   }
}
