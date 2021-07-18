package week1.assignment;

public class ArmStrongNumber {

	public static void main(String[] args) {
		int armStrongNo = 153;
		
		int originalNo = armStrongNo;

		int remainderArm, qArmStrong, cubeValue;
		int sumArmstrong = 0;
		
	

		while (armStrongNo > 0)
		{

			remainderArm = armStrongNo % 10;
			qArmStrong = armStrongNo / 10;
			cubeValue = remainderArm * remainderArm * remainderArm;
			sumArmstrong = sumArmstrong + cubeValue;

			armStrongNo = qArmStrong;

			
		}

		if (sumArmstrong == originalNo) {
			System.out.println("The given number is Armstrong number " + sumArmstrong);

		} else {
			System.out.println("The given number is not a Armstrong number " + originalNo);
		}

		
	}

}
