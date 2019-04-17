package org.vaadin.haijian;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;

@Route("")
public class DemoView extends Div {

    public DemoView() {
        add(new PaperSlider());
        add(new HelloWorld());
    }
}
