package com.devsuperior.dscommerce.entities;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_role")
public class Role {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;
	private String authorithy;
	
	public Role() {
	}

	public Role(String id, String authorithy) {
		this.id = id;
		this.authorithy = authorithy;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAuthorithy() {
		return authorithy;
	}

	public void setAuthorithy(String authorithy) {
		this.authorithy = authorithy;
	}

	@Override
	public int hashCode() {
		return Objects.hash(authorithy);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Role other = (Role) obj;
		return Objects.equals(authorithy, other.authorithy);
	}	
}
