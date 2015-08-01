/*
 * generated by Xtext
 */
package org.shashwat.xtext.smallJava.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.shashwat.xtext.smallJava.services.SmallJavaDslGrammarAccess;
import org.shashwat.xtext.smallJava.smallJavaDsl.Attribute;
import org.shashwat.xtext.smallJava.smallJavaDsl.SmallJava;
import org.shashwat.xtext.smallJava.smallJavaDsl.SmallJavaDslPackage;

@SuppressWarnings("all")
public class SmallJavaDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private SmallJavaDslGrammarAccess grammarAccess;
	
	@Override
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == SmallJavaDslPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case SmallJavaDslPackage.ATTRIBUTE:
				sequence_Attribute(context, (Attribute) semanticObject); 
				return; 
			case SmallJavaDslPackage.SMALL_JAVA:
				sequence_SmallJava(context, (SmallJava) semanticObject); 
				return; 
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Attribute(EObject context, Attribute semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SmallJavaDslPackage.Literals.ATTRIBUTE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmallJavaDslPackage.Literals.ATTRIBUTE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID parent=[SmallJava|ID]? attribute+=Attribute*)
	 */
	protected void sequence_SmallJava(EObject context, SmallJava semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
