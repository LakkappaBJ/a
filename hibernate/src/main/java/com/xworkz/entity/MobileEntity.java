package com.xworkz.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@NamedQueries({
	@NamedQuery(name="MobileEntity.getMobileDetails",query="from MobileEntity"),
	@NamedQuery(name="MobileEntity.countMobiles",query="select count(*) from MobileEntity"),
	@NamedQuery(name="maxMemorySize",query=" select max(memory) from MobileEntity "),
	@NamedQuery(name="avgMobileId",query="select avg(mobId) from MobileEntity "),
	@NamedQuery(name="MobileEntity.secondHighest",query=" select max(memory) from MobileEntity where memory<(select max(memory) from MobileEntity )"),
	@NamedQuery(name="MobileEntity.changeMemoryHQL",query="UPDATE MobileEntity SET memory=:x where BatteryCapacity=:y")
	
	//@NamedQuery(name="MobileEntity.changeMemorySQL",query="update mobile_details set MODELNAME=:x where MOBID=:y ")
})
@Entity
@Table(name="mobile_details")
public class MobileEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="MOBID")
	private int mobId;
	
	@Column(name="MODELNAME")
	private String modelName;
	
	@Column(name="MODELNO")
	private double modelNo;
	
	@Column(name="MEMORY")
	private String memory;
	
	@Column(name="BATTERYCAPACITY")
	private String BatteryCapacity;

	public MobileEntity() {
		
	}

	public MobileEntity(int mobId, String modelName, double modelNo, String memory, String batteryCapacity) {
		super();
		this.mobId = mobId;
		this.modelName = modelName;
		this.modelNo = modelNo;
		this.memory = memory;
		this.BatteryCapacity = batteryCapacity;
	}

	public int getMobId() {
		return mobId;
	}

	public void setMobId(int mobId) {
		this.mobId = mobId;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public double getModelNo() {
		return modelNo;
	}

	public void setModelNo(double modelNo) {
		this.modelNo = modelNo;
	}

	public String getMemory() {
		return memory;
	}

	public void setMemory(String memory) {
		this.memory = memory;
	}

	public String getBatteryCapacity() {
		return BatteryCapacity;
	}

	public void setBatteryCapacity(String batteryCapacity) {
		BatteryCapacity = batteryCapacity;
	}

	@Override
	public String toString() {
		return "MobileEntity [mobId=" + mobId + ", modelName=" + modelName + ", modelNo=" + modelNo + ", memory="
				+ memory + ", BatteryCapacity=" + BatteryCapacity + "]";
	}

}
