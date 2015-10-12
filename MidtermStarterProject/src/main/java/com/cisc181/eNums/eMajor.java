package com.cisc181.eNums;

public class eMajor{
		private enum majors {
		BUSINESS, COMPSI, CHEM, PHYSICS, NURSING
	}
		majors choice;
		public eMajor(majors choice){
			this.choice=choice;
		}
		public  String getMajor()
		{
			return choice.name();
		}
	
}


