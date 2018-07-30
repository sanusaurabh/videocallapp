package org.kurento.tutorial.one2onecalladv;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller 
public class MainContoller {
@RequestMapping(value={"/", "/favicon.ico", "page*","view/*,**/msg"})
public ModelAndView indexMultipleMapping(){
     return new ModelAndView("index.html");
  }

}
