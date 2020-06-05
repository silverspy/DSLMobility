/**
 */
package dSLMobility;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Source Select</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see dSLMobility.DSLMobilityPackage#getSourceSelect()
 * @model
 * @generated
 */
public enum SourceSelect implements Enumerator {
	/**
	 * The '<em><b>Comute</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMUTE_VALUE
	 * @generated
	 * @ordered
	 */
	COMUTE(0, "comute", "comute"),

	/**
	 * The '<em><b>Rdv</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RDV_VALUE
	 * @generated
	 * @ordered
	 */
	RDV(1, "rdv", "rdv"),

	/**
	 * The '<em><b>Trajet</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRAJET_VALUE
	 * @generated
	 * @ordered
	 */
	TRAJET(2, "trajet", "trajet");

	/**
	 * The '<em><b>Comute</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Comute</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMUTE
	 * @model name="comute"
	 * @generated
	 * @ordered
	 */
	public static final int COMUTE_VALUE = 0;

	/**
	 * The '<em><b>Rdv</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Rdv</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RDV
	 * @model name="rdv"
	 * @generated
	 * @ordered
	 */
	public static final int RDV_VALUE = 1;

	/**
	 * The '<em><b>Trajet</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Trajet</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TRAJET
	 * @model name="trajet"
	 * @generated
	 * @ordered
	 */
	public static final int TRAJET_VALUE = 2;

	/**
	 * An array of all the '<em><b>Source Select</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SourceSelect[] VALUES_ARRAY = new SourceSelect[] { COMUTE, RDV, TRAJET, };

	/**
	 * A public read-only list of all the '<em><b>Source Select</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SourceSelect> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Source Select</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SourceSelect get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SourceSelect result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Source Select</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SourceSelect getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SourceSelect result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Source Select</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SourceSelect get(int value) {
		switch (value) {
		case COMUTE_VALUE:
			return COMUTE;
		case RDV_VALUE:
			return RDV;
		case TRAJET_VALUE:
			return TRAJET;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private SourceSelect(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //SourceSelect
