/**
 *    Copyright 2015 Bernardo Luís da Silva Ferreira

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
 */

package NovaSYS.IES_CBIR.data;

import java.io.Serializable;



public class QueryResult implements Serializable {

	private static final long serialVersionUID = 7574163318068684234L;
	
	private int id;
	private double distance;
	
	public QueryResult(int id, double distance) {
		this.id = id;
		this.distance = distance;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public double getDistance() {
		return distance;
	}
	
	public void setDistance(double distance) {
		this.distance = distance;
	}
	
	@Override
	public String toString() {
		return id + " " + distance;
	}

//	@Override
//	public int compareTo(QueryResult qr) {
//		if (distance > qr.getDistance())
//			return 1;
//		if (distance < qr.getDistance())
//			return -1;
//		return 0;
//	}

	public void addDistance(double score) {
		distance += score;
	}
	
}
