package Interfaces;

public interface Login {
    public void clickLogin() throws InterruptedException;

    public void openHomepage();

    public void enterUsername(String username);

    public void enterPassword(String password);

    public void clickOnContinue();

    public void clickOnLogin();
}
