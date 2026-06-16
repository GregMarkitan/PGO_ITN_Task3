public class CafeCustomer {
	private int customerId;
	private String firstName;
	private String lastName;
	private String email;

	public CafeCustomer(int customerId, String firstName,
	String lastName, String email) {
		this.customerId = customerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
    }

	public String getFullData() {
		return customerId + " - " + firstName + " " + lastName + " (" + email + ")";
    }

	@Override
	public String toString() {
		return "CafeCustomer{" +
                "customerId=" + customerId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

	@Override
	public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }

        if (!(obj instanceof CafeCustomer)) {
            return false;
        }

        CafeCustomer other = (CafeCustomer) obj;

        return customerId == other.customerId ||
               email.equals(other.email);
    }
}

