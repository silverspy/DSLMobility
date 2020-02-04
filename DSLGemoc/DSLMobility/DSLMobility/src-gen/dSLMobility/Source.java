/**
 */
package dSLMobility;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dSLMobility.Source#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see dSLMobility.DSLMobilityPackage#getSource()
 * @model
 * @generated
 */
public interface Source extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The literals are from the enumeration {@link dSLMobility.SourceName}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see dSLMobility.SourceName
	 * @see #setName(SourceName)
	 * @see dSLMobility.DSLMobilityPackage#getSource_Name()
	 * @model
	 * @generated
	 */
	SourceName getName();

	/**
	 * Sets the value of the '{@link dSLMobility.Source#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see dSLMobility.SourceName
	 * @see #getName()
	 * @generated
	 */
	void setName(SourceName value);

} // Source
