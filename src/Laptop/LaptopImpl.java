package Laptop;

public class LaptopImpl implements LaptopMethods {

    private LaptopDTO laptopDTO = new LaptopDTO();

    public void setLaptopDTO(String name, int rate){

        laptopDTO.setName(name);
        laptopDTO.setRate(rate);
    }

    @Override
    public void introduce() {

        if (laptopDTO.getRate()<= 9 && laptopDTO.getRate() >= 0){
            System.out.println("Hi, I'm " + laptopDTO.getName() + " and I'm a very slow laptop");
        }
        else if (laptopDTO.getRate() >= 10 && laptopDTO.getRate() <= 24){
            System.out.println("Hi, I'm " + laptopDTO.getName() + " and I'm a quite decent laptop");
        }
        else if (laptopDTO.getRate() >= 25 && laptopDTO.getRate() <= 50){
            System.out.println("Hi, I'm " + laptopDTO.getName() + " and I'm a gaming machine");
        }
    }

    @Override
    public void ToString() {
        laptopDTO.toString();
    }

    @Override
    public String getName() {
        return laptopDTO.getName();
    }

    @Override
    public int getRate() {
        return laptopDTO.getRate();
    }
}
