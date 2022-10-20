package com.insurance.assignmentinsurance;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="client")
public class ClientEntity {
	
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		private Integer clientid;
		private String clientname;
		private Integer contactno;
		
		public Integer getclientid() {
			return clientid;
			}
		public void setclientid(Integer clientid) {
			this.clientid = clientid;
		}
		public String getclientname() {
			return clientname;
		}
		public Integer getcontactno() {
			return contactno;
			}
		public void setcontactno(Integer contactno) {
			this.contactno = contactno;
				
			}
		
}
