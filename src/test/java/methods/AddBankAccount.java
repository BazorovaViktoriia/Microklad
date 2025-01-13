package methods;

import base.TestBase;
import pages.Payout;

public class AddBankAccount extends TestBase {
    public void addBankAccount() {
        new Authorized().login();
        new Payout().scrollDown(50).clickAddAccountBtn();
    }
}
