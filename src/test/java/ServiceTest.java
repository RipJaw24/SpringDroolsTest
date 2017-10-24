import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import ruleService.AccidentIsApplicableConfiguration;
import ruleService.AccidentIsApplicableService;
import rules.Accident;

import static org.junit.Assert.assertEquals;

/**
 * Created by Max on 10/22/2017.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AccidentIsApplicableConfiguration.class)
public class ServiceTest {

    @Autowired
    private AccidentIsApplicableService accidentIsApplicableService;

    @Test
    public void whenAccidentPaymentGT200()
    {
        Accident accident = new Accident(201.0);

        Accident returnAccident = accidentIsApplicableService.isAccidentApplicable(accident);

        assertEquals(true, returnAccident.getApplicable());

    }
}
