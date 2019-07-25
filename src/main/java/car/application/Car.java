package car.application;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

  

	@Entity
	public class Car {
		 @Id
		    @GeneratedValue(strategy = GenerationType.AUTO)
		    private long id;
		    private String company;
		    private String model;
		    
		    public Car() {
		        this.setCompany("");
		       
		    }
		    
		    public Car(String company, String model) {
		        this.setCompany(company);
		        
		    }

		    public long getId() {
		        return id;
		    }

			public void setName(String company2) {
				// TODO Auto-generated method stub
				this.setCompany(company2);
			}

			public String getCompany() {
				return company;
			}

			public void setCompany(String company) {
				this.company = company;
			}


			 @Override
			    public String toString() {
			        return "Car{" + "id=" + id + ", company=" + company + '}';
			    }
	}


