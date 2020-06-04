/**
 */
package dSLMobility;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Page</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dSLMobility.Page#getName <em>Name</em>}</li>
 *   <li>{@link dSLMobility.Page#getSource <em>Source</em>}</li>
 *   <li>{@link dSLMobility.Page#getDescription <em>Description</em>}</li>
 *   <li>{@link dSLMobility.Page#getMail <em>Mail</em>}</li>
 *   <li>{@link dSLMobility.Page#getTelephone <em>Telephone</em>}</li>
 *   <li>{@link dSLMobility.Page#getMenu <em>Menu</em>}</li>
 *   <li>{@link dSLMobility.Page#getPresentation <em>Presentation</em>}</li>
 *   <li>{@link dSLMobility.Page#getLogo <em>Logo</em>}</li>
 *   <li>{@link dSLMobility.Page#getGeolocalisation <em>Geolocalisation</em>}</li>
 *   <li>{@link dSLMobility.Page#getHeure_ouverture <em>Heure ouverture</em>}</li>
 *   <li>{@link dSLMobility.Page#getHeure_fermeture <em>Heure fermeture</em>}</li>
 *   <li>{@link dSLMobility.Page#getNb_Pers <em>Nb Pers</em>}</li>
 * </ul>
 *
 * @see dSLMobility.DSLMobilityPackage#getPage()
 * @model
 * @generated
 */
public interface Page extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see dSLMobility.DSLMobilityPackage#getPage_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link dSLMobility.Page#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference list.
	 * The list contents are of type {@link dSLMobility.Source}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' containment reference list.
	 * @see dSLMobility.DSLMobilityPackage#getPage_Source()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Source> getSource();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see dSLMobility.DSLMobilityPackage#getPage_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link dSLMobility.Page#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Mail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mail</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mail</em>' attribute.
	 * @see #setMail(String)
	 * @see dSLMobility.DSLMobilityPackage#getPage_Mail()
	 * @model
	 * @generated
	 */
	String getMail();

	/**
	 * Sets the value of the '{@link dSLMobility.Page#getMail <em>Mail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mail</em>' attribute.
	 * @see #getMail()
	 * @generated
	 */
	void setMail(String value);

	/**
	 * Returns the value of the '<em><b>Telephone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Telephone</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Telephone</em>' attribute.
	 * @see #setTelephone(String)
	 * @see dSLMobility.DSLMobilityPackage#getPage_Telephone()
	 * @model
	 * @generated
	 */
	String getTelephone();

	/**
	 * Sets the value of the '{@link dSLMobility.Page#getTelephone <em>Telephone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Telephone</em>' attribute.
	 * @see #getTelephone()
	 * @generated
	 */
	void setTelephone(String value);

	/**
	 * Returns the value of the '<em><b>Menu</b></em>' attribute.
	 * The literals are from the enumeration {@link dSLMobility.SourceMenu}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Menu</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Menu</em>' attribute.
	 * @see dSLMobility.SourceMenu
	 * @see #setMenu(SourceMenu)
	 * @see dSLMobility.DSLMobilityPackage#getPage_Menu()
	 * @model
	 * @generated
	 */
	SourceMenu getMenu();

	/**
	 * Sets the value of the '{@link dSLMobility.Page#getMenu <em>Menu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Menu</em>' attribute.
	 * @see dSLMobility.SourceMenu
	 * @see #getMenu()
	 * @generated
	 */
	void setMenu(SourceMenu value);

	/**
	 * Returns the value of the '<em><b>Presentation</b></em>' attribute.
	 * The literals are from the enumeration {@link dSLMobility.SourcePres}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Presentation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Presentation</em>' attribute.
	 * @see dSLMobility.SourcePres
	 * @see #setPresentation(SourcePres)
	 * @see dSLMobility.DSLMobilityPackage#getPage_Presentation()
	 * @model
	 * @generated
	 */
	SourcePres getPresentation();

	/**
	 * Sets the value of the '{@link dSLMobility.Page#getPresentation <em>Presentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Presentation</em>' attribute.
	 * @see dSLMobility.SourcePres
	 * @see #getPresentation()
	 * @generated
	 */
	void setPresentation(SourcePres value);

	/**
	 * Returns the value of the '<em><b>Logo</b></em>' attribute.
	 * The literals are from the enumeration {@link dSLMobility.SourceLogo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Logo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logo</em>' attribute.
	 * @see dSLMobility.SourceLogo
	 * @see #setLogo(SourceLogo)
	 * @see dSLMobility.DSLMobilityPackage#getPage_Logo()
	 * @model
	 * @generated
	 */
	SourceLogo getLogo();

	/**
	 * Sets the value of the '{@link dSLMobility.Page#getLogo <em>Logo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logo</em>' attribute.
	 * @see dSLMobility.SourceLogo
	 * @see #getLogo()
	 * @generated
	 */
	void setLogo(SourceLogo value);

	/**
	 * Returns the value of the '<em><b>Geolocalisation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Geolocalisation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geolocalisation</em>' attribute.
	 * @see #setGeolocalisation(Boolean)
	 * @see dSLMobility.DSLMobilityPackage#getPage_Geolocalisation()
	 * @model
	 * @generated
	 */
	Boolean getGeolocalisation();

	/**
	 * Sets the value of the '{@link dSLMobility.Page#getGeolocalisation <em>Geolocalisation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geolocalisation</em>' attribute.
	 * @see #getGeolocalisation()
	 * @generated
	 */
	void setGeolocalisation(Boolean value);

	/**
	 * Returns the value of the '<em><b>Heure ouverture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Heure ouverture</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Heure ouverture</em>' attribute.
	 * @see #setHeure_ouverture(int)
	 * @see dSLMobility.DSLMobilityPackage#getPage_Heure_ouverture()
	 * @model
	 * @generated
	 */
	int getHeure_ouverture();

	/**
	 * Sets the value of the '{@link dSLMobility.Page#getHeure_ouverture <em>Heure ouverture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Heure ouverture</em>' attribute.
	 * @see #getHeure_ouverture()
	 * @generated
	 */
	void setHeure_ouverture(int value);

	/**
	 * Returns the value of the '<em><b>Heure fermeture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Heure fermeture</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Heure fermeture</em>' attribute.
	 * @see #setHeure_fermeture(int)
	 * @see dSLMobility.DSLMobilityPackage#getPage_Heure_fermeture()
	 * @model
	 * @generated
	 */
	int getHeure_fermeture();

	/**
	 * Sets the value of the '{@link dSLMobility.Page#getHeure_fermeture <em>Heure fermeture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Heure fermeture</em>' attribute.
	 * @see #getHeure_fermeture()
	 * @generated
	 */
	void setHeure_fermeture(int value);

	/**
	 * Returns the value of the '<em><b>Nb Pers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nb Pers</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb Pers</em>' attribute.
	 * @see #setNb_Pers(int)
	 * @see dSLMobility.DSLMobilityPackage#getPage_Nb_Pers()
	 * @model
	 * @generated
	 */
	int getNb_Pers();

	/**
	 * Sets the value of the '{@link dSLMobility.Page#getNb_Pers <em>Nb Pers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nb Pers</em>' attribute.
	 * @see #getNb_Pers()
	 * @generated
	 */
	void setNb_Pers(int value);

} // Page
