/*
 * generated by Xtext
 */
package org.shashwat.xtext.smallJava.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class SmallJavaDslGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class NamespaceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Namespace");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cNamespaceKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameQualifiedNameParserRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Assignment cImportsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cImportsImportParserRuleCall_2_0 = (RuleCall)cImportsAssignment_2.eContents().get(0);
		private final Assignment cSmallJavaAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cSmallJavaSmallJavaParserRuleCall_3_0 = (RuleCall)cSmallJavaAssignment_3.eContents().get(0);
		
		//Namespace:
		//	"namespace" name=QualifiedName imports+=Import* smallJava=SmallJava;
		@Override public ParserRule getRule() { return rule; }

		//"namespace" name=QualifiedName imports+=Import* smallJava=SmallJava
		public Group getGroup() { return cGroup; }

		//"namespace"
		public Keyword getNamespaceKeyword_0() { return cNamespaceKeyword_0; }

		//name=QualifiedName
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//QualifiedName
		public RuleCall getNameQualifiedNameParserRuleCall_1_0() { return cNameQualifiedNameParserRuleCall_1_0; }

		//imports+=Import*
		public Assignment getImportsAssignment_2() { return cImportsAssignment_2; }

		//Import
		public RuleCall getImportsImportParserRuleCall_2_0() { return cImportsImportParserRuleCall_2_0; }

		//smallJava=SmallJava
		public Assignment getSmallJavaAssignment_3() { return cSmallJavaAssignment_3; }

		//SmallJava
		public RuleCall getSmallJavaSmallJavaParserRuleCall_3_0() { return cSmallJavaSmallJavaParserRuleCall_3_0; }
	}

	public class ImportElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Import");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cImportKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cImportedNamespaceAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cImportedNamespaceQualifiedNameWithWildCardsParserRuleCall_1_0 = (RuleCall)cImportedNamespaceAssignment_1.eContents().get(0);
		
		//Import:
		//	"import" importedNamespace=QualifiedNameWithWildCards;
		@Override public ParserRule getRule() { return rule; }

		//"import" importedNamespace=QualifiedNameWithWildCards
		public Group getGroup() { return cGroup; }

		//"import"
		public Keyword getImportKeyword_0() { return cImportKeyword_0; }

		//importedNamespace=QualifiedNameWithWildCards
		public Assignment getImportedNamespaceAssignment_1() { return cImportedNamespaceAssignment_1; }

		//QualifiedNameWithWildCards
		public RuleCall getImportedNamespaceQualifiedNameWithWildCardsParserRuleCall_1_0() { return cImportedNamespaceQualifiedNameWithWildCardsParserRuleCall_1_0; }
	}

	public class QualifiedNameElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "QualifiedName");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cFullStopKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		
		//QualifiedName:
		//	ID ("." ID)*;
		@Override public ParserRule getRule() { return rule; }

		//ID ("." ID)*
		public Group getGroup() { return cGroup; }

		//ID
		public RuleCall getIDTerminalRuleCall_0() { return cIDTerminalRuleCall_0; }

		//("." ID)*
		public Group getGroup_1() { return cGroup_1; }

		//"."
		public Keyword getFullStopKeyword_1_0() { return cFullStopKeyword_1_0; }

		//ID
		public RuleCall getIDTerminalRuleCall_1_1() { return cIDTerminalRuleCall_1_1; }
	}

	public class QualifiedNameWithWildCardsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "QualifiedNameWithWildCards");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cQualifiedNameParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Keyword cFullStopAsteriskKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//QualifiedNameWithWildCards:
		//	QualifiedName ".*"?;
		@Override public ParserRule getRule() { return rule; }

		//QualifiedName ".*"?
		public Group getGroup() { return cGroup; }

		//QualifiedName
		public RuleCall getQualifiedNameParserRuleCall_0() { return cQualifiedNameParserRuleCall_0; }

		//".*"?
		public Keyword getFullStopAsteriskKeyword_1() { return cFullStopAsteriskKeyword_1; }
	}

	public class SmallJavaElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "SmallJava");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cVisibilityAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cVisibilityVisibilityTypesEnumRuleCall_0_0 = (RuleCall)cVisibilityAssignment_0.eContents().get(0);
		private final Assignment cFinalAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final Keyword cFinalFinalKeyword_1_0 = (Keyword)cFinalAssignment_1.eContents().get(0);
		private final Keyword cClassKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cNameAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cNameIDTerminalRuleCall_3_0 = (RuleCall)cNameAssignment_3.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cExtendsKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cParentAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final CrossReference cParentSmallJavaCrossReference_4_1_0 = (CrossReference)cParentAssignment_4_1.eContents().get(0);
		private final RuleCall cParentSmallJavaIDTerminalRuleCall_4_1_0_1 = (RuleCall)cParentSmallJavaCrossReference_4_1_0.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cAttributeAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cAttributeAttributeParserRuleCall_6_0 = (RuleCall)cAttributeAssignment_6.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//SmallJava:
		//	visibility=VisibilityTypes? final?="final"? "class" name=ID ("extends" parent=[SmallJava])? "{" attribute+=Attribute*
		//	"}";
		@Override public ParserRule getRule() { return rule; }

		//visibility=VisibilityTypes? final?="final"? "class" name=ID ("extends" parent=[SmallJava])? "{" attribute+=Attribute*
		//"}"
		public Group getGroup() { return cGroup; }

		//visibility=VisibilityTypes?
		public Assignment getVisibilityAssignment_0() { return cVisibilityAssignment_0; }

		//VisibilityTypes
		public RuleCall getVisibilityVisibilityTypesEnumRuleCall_0_0() { return cVisibilityVisibilityTypesEnumRuleCall_0_0; }

		//final?="final"?
		public Assignment getFinalAssignment_1() { return cFinalAssignment_1; }

		//"final"
		public Keyword getFinalFinalKeyword_1_0() { return cFinalFinalKeyword_1_0; }

		//"class"
		public Keyword getClassKeyword_2() { return cClassKeyword_2; }

		//name=ID
		public Assignment getNameAssignment_3() { return cNameAssignment_3; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_3_0() { return cNameIDTerminalRuleCall_3_0; }

		//("extends" parent=[SmallJava])?
		public Group getGroup_4() { return cGroup_4; }

		//"extends"
		public Keyword getExtendsKeyword_4_0() { return cExtendsKeyword_4_0; }

		//parent=[SmallJava]
		public Assignment getParentAssignment_4_1() { return cParentAssignment_4_1; }

		//[SmallJava]
		public CrossReference getParentSmallJavaCrossReference_4_1_0() { return cParentSmallJavaCrossReference_4_1_0; }

		//ID
		public RuleCall getParentSmallJavaIDTerminalRuleCall_4_1_0_1() { return cParentSmallJavaIDTerminalRuleCall_4_1_0_1; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_5() { return cLeftCurlyBracketKeyword_5; }

		//attribute+=Attribute*
		public Assignment getAttributeAssignment_6() { return cAttributeAssignment_6; }

		//Attribute
		public RuleCall getAttributeAttributeParserRuleCall_6_0() { return cAttributeAttributeParserRuleCall_6_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_7() { return cRightCurlyBracketKeyword_7; }
	}

	public class AttributeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Attribute");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cDatatypeAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cDatatypeDatatypeParserRuleCall_0_0 = (RuleCall)cDatatypeAssignment_0.eContents().get(0);
		private final Assignment cArrayAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final Keyword cArrayLeftSquareBracketRightSquareBracketKeyword_1_0 = (Keyword)cArrayAssignment_1.eContents().get(0);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		
		//Attribute:
		//	datatype=Datatype array?="[]"? name=ID;
		@Override public ParserRule getRule() { return rule; }

		//datatype=Datatype array?="[]"? name=ID
		public Group getGroup() { return cGroup; }

		//datatype=Datatype
		public Assignment getDatatypeAssignment_0() { return cDatatypeAssignment_0; }

		//Datatype
		public RuleCall getDatatypeDatatypeParserRuleCall_0_0() { return cDatatypeDatatypeParserRuleCall_0_0; }

		//array?="[]"?
		public Assignment getArrayAssignment_1() { return cArrayAssignment_1; }

		//"[]"
		public Keyword getArrayLeftSquareBracketRightSquareBracketKeyword_1_0() { return cArrayLeftSquareBracketRightSquareBracketKeyword_1_0; }

		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }
	}

	public class DatatypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Datatype");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Action cDatatypeAction_0_0 = (Action)cGroup_0.eContents().get(0);
		private final RuleCall cSimpleTypeParserRuleCall_0_1 = (RuleCall)cGroup_0.eContents().get(1);
		private final RuleCall cSmallJavaTypeParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//Datatype:
		//	{Datatype} SimpleType | SmallJavaType;
		@Override public ParserRule getRule() { return rule; }

		//{Datatype} SimpleType | SmallJavaType
		public Alternatives getAlternatives() { return cAlternatives; }

		//{Datatype} SimpleType
		public Group getGroup_0() { return cGroup_0; }

		//{Datatype}
		public Action getDatatypeAction_0_0() { return cDatatypeAction_0_0; }

		//SimpleType
		public RuleCall getSimpleTypeParserRuleCall_0_1() { return cSimpleTypeParserRuleCall_0_1; }

		//SmallJavaType
		public RuleCall getSmallJavaTypeParserRuleCall_1() { return cSmallJavaTypeParserRuleCall_1; }
	}

	public class SimpleTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "SimpleType");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Keyword cStringKeyword_0 = (Keyword)cAlternatives.eContents().get(0);
		private final Keyword cIntegerKeyword_1 = (Keyword)cAlternatives.eContents().get(1);
		private final Keyword cBooleanKeyword_2 = (Keyword)cAlternatives.eContents().get(2);
		private final Keyword cDecimalKeyword_3 = (Keyword)cAlternatives.eContents().get(3);
		private final Keyword cBigDecimalKeyword_4 = (Keyword)cAlternatives.eContents().get(4);
		
		//SimpleType:
		//	"String" | "Integer" | "Boolean" | "Decimal" | "BigDecimal";
		@Override public ParserRule getRule() { return rule; }

		//"String" | "Integer" | "Boolean" | "Decimal" | "BigDecimal"
		public Alternatives getAlternatives() { return cAlternatives; }

		//"String"
		public Keyword getStringKeyword_0() { return cStringKeyword_0; }

		//"Integer"
		public Keyword getIntegerKeyword_1() { return cIntegerKeyword_1; }

		//"Boolean"
		public Keyword getBooleanKeyword_2() { return cBooleanKeyword_2; }

		//"Decimal"
		public Keyword getDecimalKeyword_3() { return cDecimalKeyword_3; }

		//"BigDecimal"
		public Keyword getBigDecimalKeyword_4() { return cBigDecimalKeyword_4; }
	}

	public class SmallJavaTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "SmallJavaType");
		private final Assignment cTypeAssignment = (Assignment)rule.eContents().get(1);
		private final CrossReference cTypeSmallJavaCrossReference_0 = (CrossReference)cTypeAssignment.eContents().get(0);
		private final RuleCall cTypeSmallJavaIDTerminalRuleCall_0_1 = (RuleCall)cTypeSmallJavaCrossReference_0.eContents().get(1);
		
		//SmallJavaType:
		//	type=[SmallJava];
		@Override public ParserRule getRule() { return rule; }

		//type=[SmallJava]
		public Assignment getTypeAssignment() { return cTypeAssignment; }

		//[SmallJava]
		public CrossReference getTypeSmallJavaCrossReference_0() { return cTypeSmallJavaCrossReference_0; }

		//ID
		public RuleCall getTypeSmallJavaIDTerminalRuleCall_0_1() { return cTypeSmallJavaIDTerminalRuleCall_0_1; }
	}
	
	
	public class VisibilityTypesElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "VisibilityTypes");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cPUBLICEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cPUBLICPublicKeyword_0_0 = (Keyword)cPUBLICEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cPRIVATEEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cPRIVATEPrivateKeyword_1_0 = (Keyword)cPRIVATEEnumLiteralDeclaration_1.eContents().get(0);
		
		//enum VisibilityTypes:
		//	PUBLIC="public" | PRIVATE="private";
		public EnumRule getRule() { return rule; }

		//PUBLIC="public" | PRIVATE="private"
		public Alternatives getAlternatives() { return cAlternatives; }

		//PUBLIC="public"
		public EnumLiteralDeclaration getPUBLICEnumLiteralDeclaration_0() { return cPUBLICEnumLiteralDeclaration_0; }

		//"public"
		public Keyword getPUBLICPublicKeyword_0_0() { return cPUBLICPublicKeyword_0_0; }

		//PRIVATE="private"
		public EnumLiteralDeclaration getPRIVATEEnumLiteralDeclaration_1() { return cPRIVATEEnumLiteralDeclaration_1; }

		//"private"
		public Keyword getPRIVATEPrivateKeyword_1_0() { return cPRIVATEPrivateKeyword_1_0; }
	}
	
	private final NamespaceElements pNamespace;
	private final ImportElements pImport;
	private final QualifiedNameElements pQualifiedName;
	private final QualifiedNameWithWildCardsElements pQualifiedNameWithWildCards;
	private final SmallJavaElements pSmallJava;
	private final VisibilityTypesElements unknownRuleVisibilityTypes;
	private final AttributeElements pAttribute;
	private final DatatypeElements pDatatype;
	private final SimpleTypeElements pSimpleType;
	private final SmallJavaTypeElements pSmallJavaType;
	
	private final Grammar grammar;

	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public SmallJavaDslGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pNamespace = new NamespaceElements();
		this.pImport = new ImportElements();
		this.pQualifiedName = new QualifiedNameElements();
		this.pQualifiedNameWithWildCards = new QualifiedNameWithWildCardsElements();
		this.pSmallJava = new SmallJavaElements();
		this.unknownRuleVisibilityTypes = new VisibilityTypesElements();
		this.pAttribute = new AttributeElements();
		this.pDatatype = new DatatypeElements();
		this.pSimpleType = new SimpleTypeElements();
		this.pSmallJavaType = new SmallJavaTypeElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.shashwat.xtext.smallJava.SmallJavaDsl".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	

	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Namespace:
	//	"namespace" name=QualifiedName imports+=Import* smallJava=SmallJava;
	public NamespaceElements getNamespaceAccess() {
		return pNamespace;
	}
	
	public ParserRule getNamespaceRule() {
		return getNamespaceAccess().getRule();
	}

	//Import:
	//	"import" importedNamespace=QualifiedNameWithWildCards;
	public ImportElements getImportAccess() {
		return pImport;
	}
	
	public ParserRule getImportRule() {
		return getImportAccess().getRule();
	}

	//QualifiedName:
	//	ID ("." ID)*;
	public QualifiedNameElements getQualifiedNameAccess() {
		return pQualifiedName;
	}
	
	public ParserRule getQualifiedNameRule() {
		return getQualifiedNameAccess().getRule();
	}

	//QualifiedNameWithWildCards:
	//	QualifiedName ".*"?;
	public QualifiedNameWithWildCardsElements getQualifiedNameWithWildCardsAccess() {
		return pQualifiedNameWithWildCards;
	}
	
	public ParserRule getQualifiedNameWithWildCardsRule() {
		return getQualifiedNameWithWildCardsAccess().getRule();
	}

	//SmallJava:
	//	visibility=VisibilityTypes? final?="final"? "class" name=ID ("extends" parent=[SmallJava])? "{" attribute+=Attribute*
	//	"}";
	public SmallJavaElements getSmallJavaAccess() {
		return pSmallJava;
	}
	
	public ParserRule getSmallJavaRule() {
		return getSmallJavaAccess().getRule();
	}

	//enum VisibilityTypes:
	//	PUBLIC="public" | PRIVATE="private";
	public VisibilityTypesElements getVisibilityTypesAccess() {
		return unknownRuleVisibilityTypes;
	}
	
	public EnumRule getVisibilityTypesRule() {
		return getVisibilityTypesAccess().getRule();
	}

	//Attribute:
	//	datatype=Datatype array?="[]"? name=ID;
	public AttributeElements getAttributeAccess() {
		return pAttribute;
	}
	
	public ParserRule getAttributeRule() {
		return getAttributeAccess().getRule();
	}

	//Datatype:
	//	{Datatype} SimpleType | SmallJavaType;
	public DatatypeElements getDatatypeAccess() {
		return pDatatype;
	}
	
	public ParserRule getDatatypeRule() {
		return getDatatypeAccess().getRule();
	}

	//SimpleType:
	//	"String" | "Integer" | "Boolean" | "Decimal" | "BigDecimal";
	public SimpleTypeElements getSimpleTypeAccess() {
		return pSimpleType;
	}
	
	public ParserRule getSimpleTypeRule() {
		return getSimpleTypeAccess().getRule();
	}

	//SmallJavaType:
	//	type=[SmallJava];
	public SmallJavaTypeElements getSmallJavaTypeAccess() {
		return pSmallJavaType;
	}
	
	public ParserRule getSmallJavaTypeRule() {
		return getSmallJavaTypeAccess().getRule();
	}

	//terminal ID:
	//	"^"? ("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	} 

	//terminal INT returns ecore::EInt:
	//	"0".."9"+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	} 

	//terminal STRING:
	//	"\"" ("\\" . / * 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' * / | !("\\" | "\""))* "\"" | "\'" ("\\" .
	//	/ * 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' * / | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	"//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	} 
}
