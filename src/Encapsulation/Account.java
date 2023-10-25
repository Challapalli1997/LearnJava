package Encapsulation;

class Account {
    // private data members to hide the data
    private long acc_no;
    private String name, email;
    private float amount;
    // public getter and setter methods
    public long getAcc_no() { return acc_no; }
    public void setAcc_no(long acc_no)
    {
        this.acc_no = acc_no;
    }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getEmail() { return email; }
    public void setEmail(String email)
    {
        this.email = email;
    }
    public float getAmount() { return amount; }
    public void setAmount(float amount)
    {
        this.amount = amount;
    }


    public static void main(String[] args)
    {
        // creating instance of Account class
        Account acc = new Account();
        // setting values through setter methods
        acc.setAcc_no(9999);
        acc.setName("Challapalli Srivastava");
        acc.setEmail("srivastava.challapalli@gmail.com");
        acc.setAmount(999999f);
        // getting values through getter methods
        System.out.println(
                acc.getAcc_no() + " " + acc.getName() + " "
                        + acc.getEmail() + " " + acc.getAmount());
    }
}

