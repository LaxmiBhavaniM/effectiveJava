package builderpattern;
class AlertDetailTest{
    public static void main(String args[]){
    	AlertDetail alertDetail = new AlertDetail.Builder(10d, "test detail", 1, "test parent entity", 20d)
    			.withFactorId(123d).build();
    	System.out.println(alertDetail);
    }
}