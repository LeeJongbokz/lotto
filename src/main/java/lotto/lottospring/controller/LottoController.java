package lotto.lottospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LottoController {

    @GetMapping("lotto")
    public String lotto(Model model){
        int randNum = (int)((Math.random()*45)+1);
        model.addAttribute("data", randNum);
        return "lotto";
    }
}
