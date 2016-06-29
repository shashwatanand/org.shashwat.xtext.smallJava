/*
 * generated by Xtext
 */
package org.shashwat.xtext.smallJava.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.shashwat.xtext.smallJava.services.SmallJavaDslGrammarAccess;
import org.shashwat.xtext.smallJava.smallJavaDsl.Attribute;
import org.shashwat.xtext.smallJava.smallJavaDsl.Datatype;
import org.shashwat.xtext.smallJava.smallJavaDsl.Import;
import org.shashwat.xtext.smallJava.smallJavaDsl.Namespace;
import org.shashwat.xtext.smallJava.smallJavaDsl.SmallJava;
import org.shashwat.xtext.smallJava.smallJavaDsl.SmallJavaDslPackage;
import org.shashwat.xtext.smallJava.smallJavaDsl.SmallJavaType;

@SuppressWarnings("all")
public class SmallJavaDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private SmallJavaDslGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == SmallJavaDslPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case SmallJavaDslPackage.ATTRIBUTE:
				sequence_Attribute(context, (Attribute) semanticObject); 
				return; 
			case SmallJavaDslPackage.DATATYPE:
				sequence_Datatype(context, (Datatype) semanticObject); 
				return; 
			case SmallJavaDslPackage.IMPORT:
				sequence_Import(context, (Import) semanticObject); 
				return; 
			case SmallJavaDslPackage.NAMESPACE:
				sequence_Namespace(context, (Namespace) semanticObject); 
				return; 
			case SmallJavaDslPackage.SMALL_JAVA:
				sequence_SmallJava(context, (SmallJava) semanticObject); 
				return; 
			case SmallJavaDslPackage.SMALL_JAVA_TYPE:
				sequence_SmallJavaType(context, (SmallJavaType) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Attribute returns Attribute
	 *
	 * Constraint:
	 *     (datatype=Datatype array?='[]'? name=ID)
	 */
	protected void sequence_Attribute(ISerializationContext context, Attribute semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Datatype returns Datatype
	 *
	 * Constraint:
	 *     {Datatype}
	 */
	protected void sequence_Datatype(ISerializationContext context, Datatype semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Import returns Import
	 *
	 * Constraint:
	 *     importedNamespace=QualifiedNameWithWildCards
	 */
	protected void sequence_Import(ISerializationContext context, Import semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SmallJavaDslPackage.Literals.IMPORT__IMPORTED_NAMESPACE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmallJavaDslPackage.Literals.IMPORT__IMPORTED_NAMESPACE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildCardsParserRuleCall_1_0(), semanticObject.getImportedNamespace());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Namespace returns Namespace
	 *
	 * Constraint:
	 *     (name=QualifiedName imports+=Import* smallJava=SmallJava)
	 */
	protected void sequence_Namespace(ISerializationContext context, Namespace semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Datatype returns SmallJavaType
	 *     SmallJavaType returns SmallJavaType
	 *
	 * Constraint:
	 *     type=[SmallJava|ID]
	 */
	protected void sequence_SmallJavaType(ISerializationContext context, SmallJavaType semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SmallJavaDslPackage.Literals.SMALL_JAVA_TYPE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmallJavaDslPackage.Literals.SMALL_JAVA_TYPE__TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSmallJavaTypeAccess().getTypeSmallJavaIDTerminalRuleCall_0_1(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     SmallJava returns SmallJava
	 *
	 * Constraint:
	 *     (visibility=VisibilityTypes? final?='final'? name=ID parent=[SmallJava|ID]? attribute+=Attribute*)
	 */
	protected void sequence_SmallJava(ISerializationContext context, SmallJava semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
