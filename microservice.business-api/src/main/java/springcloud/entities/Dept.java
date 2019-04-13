package springcloud.entities;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;


@SuppressWarnings("serial")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Accessors(chain=true)
public class Dept implements Serializable{

	private String d_no;
	private String d_name;
	private String db_source;
	
	public static void main(String[] args) {
		Dept de=new Dept();
		de.setD_no("1").setD_name("INFO").setDb_source("oracle");
	}
	
}
