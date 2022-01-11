package com.marticus.training.Exception;

public class TestClassCar {
	public static void main(String[] args)  {
		try {
		validateCarModel("Audi");
		}
		catch(InvalidCarModelException ex) {
			ex.printStackTrace();
		}
	}
	public static void validateCarModel(String carModel) throws InvalidCarModelException {
		if(carModel!="Volvo"){
			throw new InvalidCarModelException("Invalid model--"+carModel);
	}
		else {
			System.out.println("Valid model");
		}
	}

}
