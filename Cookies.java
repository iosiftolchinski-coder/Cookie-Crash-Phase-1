public class Cookies {
    int CookiesCount = 0;
    int CookierClick = 1;
    int NewPurchases = 0;
    int NewCost = 100;

    public int getCookiesCount(){return CookiesCount;}
    public int getCookierClick(){return CookierClick;}
    public int getNewPurchases(){return NewPurchases;}

    public void Click(){
        CookiesCount+= CookierClick;
    }

    public int getNewCost(){
        100(cost)*(1.100)^(how many times purchased)
        return (int) Math.round(Cost*Math.pow(1.100,NewPurchases));
    }

    public boolean buyNew(){
        int Newcost = getNewCost();
        if(CookiesCount>=Newcost){
            CookiesCount-=Newcost;
            NewPurchases++;
            CookierClick++;
            return true;
        }
        return false;
    }
}
