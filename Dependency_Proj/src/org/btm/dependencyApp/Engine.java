package org.btm.dependencyApp;
public class Engine // Dependency Class 
{
  private int engine_number;
  private int horse_power;
  private String engine_type;
public int getEngine_number() {
	return engine_number;
}
public void setEngine_number(int engine_number) {
	this.engine_number = engine_number;
}
public int getHorse_power() {
	return horse_power;
}
public void setHorse_power(int horse_power) {
	this.horse_power = horse_power;
}
public String getEngine_type() {
	return engine_type;
}
public void setEngine_type(String engine_type) {
	this.engine_type = engine_type;
}
  @Override
	public String toString() {
		return "Details are[Engine_Number =  "+engine_number+" Horse_Power = "+horse_power+" Engine_Type = "+engine_type+"]";
	}
}
