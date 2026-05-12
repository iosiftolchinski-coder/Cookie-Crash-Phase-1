public class Cookies {
    int CookiesCount = 0;
    int CookierClick = 1;
    int UpgradePurchases = 0;
    int UpgradeCost = 100;

    public int getCookiesCount(){return CookiesCount;}
    public int getCookierClick(){return CookierClick;}
    public int getUpgradePurchases(){return UpgradePurchases;}

    public void Click(){
        CookiesCount+= CookierClick;
    }

    public int getUpgradeCost(){
        //100(cost)*(1.100)^(how many times purchased)
        return (int) Math.round(Cost*Math.pow(1.100,UpgradePurchases));
    }

    public boolean buyUpgrade(){
        int Upgradecost = getUpgradeCost();
        if(CookiesCount>=Upgradecost){
            CookiesCount-=Upgradecost;
            UpgradePurchases++;
            CookierClick++;
            return true;
        }
        return false;
    }
}
