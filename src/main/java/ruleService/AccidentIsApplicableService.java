package ruleService;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import rules.Accident;

/**
 * Created by Max on 10/22/2017.
 */
@Service
@RestController
@RequestMapping(method = RequestMethod.POST, consumes="application/json")
public class AccidentIsApplicableService {

    @Autowired
    private KieContainer kieContainer;

    @RequestMapping("/accident")
    public @ResponseBody Accident isAccidentApplicable(@RequestBody Accident accident) {
        KieSession  kieSession = kieContainer.newKieSession();
        kieSession.insert(accident);
        kieSession.fireAllRules();
        kieSession.dispose();

        return accident;
    }
}
