package com.example.application.views.main;

import com.example.application.ui5webcomponents.MultiComboBoxItem;
import com.example.application.ui5webcomponents.ShellBar;
import com.example.application.ui5webcomponents.Ui5HeaderPanel;
import com.example.application.ui5webcomponents.Ui5MultiComboBox;
import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.checkbox.Checkbox;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.dependency.JavaScript;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Main")
@CssImport("./themes/mytodo/styles.css")
@JavaScript("@ui5/webcomponents-icons/dist/AllIcons.js")
@Route("")
public class MainView extends Div {

    public MainView() {

        ShellBar shellBar = new ShellBar();
        shellBar.setPrimaryTitle("Vaadin meets Eclipse Furo Ui5 Components");

        Ui5HeaderPanel headerPanel = new Ui5HeaderPanel("Vaadin ToDo");
        headerPanel.setIcon("task");

        VerticalLayout todosList = new VerticalLayout();

        Ui5MultiComboBox multiCombo1 = new Ui5MultiComboBox();
        multiCombo1.setPlaceholder("Enter or pick items");
        multiCombo1.addSelectionChangeListener(e -> {
            System.out.println(e);

        });

        MultiComboBoxItem item = new MultiComboBoxItem();
        item.setText("Vaadin");
        item.setAdditionalText("The modern web application platform for Java");

        MultiComboBoxItem item2 = new MultiComboBoxItem();
        item2.setText("SAP Ui5 Web Components");
        item2.setAdditionalText("Enterprise-flavored sugar on top of native APIs!");

        multiCombo1.add(item);
        multiCombo1.add(item2);

        headerPanel.add(multiCombo1);
        headerPanel.addToAction(multiCombo1);

        TextField taskField = new TextField();
        Button addButton = new Button("Add");
        addButton.addClickListener(click -> {
            Checkbox checkbox = new Checkbox(taskField.getValue());
            todosList.add(checkbox);
        });
        addButton.addClickShortcut(Key.ENTER);

        todosList.add(
              new H1("Vaadin Todo"),
              new HorizontalLayout(
                    taskField,
                    addButton
              )
        );
        this.add(shellBar, headerPanel, todosList);
    }
}