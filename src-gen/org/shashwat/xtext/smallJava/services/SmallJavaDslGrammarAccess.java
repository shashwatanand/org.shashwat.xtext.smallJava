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
	
	
	public class SmallJavaElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "SmallJava");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cClassKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cExtendsKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cParentAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cParentSmallJavaCrossReference_3_0 = (CrossReference)cParentAssignment_3.eContents().get(0);
		private final RuleCall cParentSmallJavaIDTerminalRuleCall_3_0_1 = (RuleCall)cParentSmallJavaCrossReference_3_0.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cAttributeAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cAttributeAttributeParserRuleCall_5_0 = (RuleCall)cAttributeAssignment_5.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//SmallJava:
		//	"class" name=ID "extends" parent=[SmallJava] "{" attribute=Attribute "}";
		@Override public ParserRule getRule() { return rule; }

		//"class" name=ID "extends" parent=[SmallJava] "{" attribute=Attribute "}"
		public Group getGroup() { return cGroup; }

		//"class"
		public Keyword getClassKeyword_0() { return cClassKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//"extends"
		public Keyword getExtendsKeyword_2() { return cExtendsKeyword_2; }

		//parent=[SmallJava]
		public Assignment getParentAssignment_3() { return cParentAssignment_3; }

		//[SmallJava]
		public CrossReference getParentSmallJavaCrossReference_3_0() { return cParentSmallJavaCrossReference_3_0; }

		//ID
		public RuleCall getParentSmallJavaIDTerminalRuleCall_3_0_1() { return cParentSmallJavaIDTerminalRuleCall_3_0_1; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_4() { return cLeftCurlyBracketKeyword_4; }

		//attribute=Attribute
		public Assignment getAttributeAssignment_5() { return cAttributeAssignment_5; }

		//Attribute
		public RuleCall getAttributeAttributeParserRuleCall_5_0() { return cAttributeAttributeParserRuleCall_5_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
	}

	public class AttributeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Attribute");
		private final Assignment cNameAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_0 = (RuleCall)cNameAssignment.eContents().get(0);
		
		//Attribute:
		//	name=ID;
		@Override public ParserRule getRule() { return rule; }

		//name=ID
		public Assignment getNameAssignment() { return cNameAssignment; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_0() { return cNameIDTerminalRuleCall_0; }
	}
	
	
	private final SmallJavaElements pSmallJava;
	private final AttributeElements pAttribute;
	
	private final Grammar grammar;

	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public SmallJavaDslGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pSmallJava = new SmallJavaElements();
		this.pAttribute = new AttributeElements();
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

	
	//SmallJava:
	//	"class" name=ID "extends" parent=[SmallJava] "{" attribute=Attribute "}";
	public SmallJavaElements getSmallJavaAccess() {
		return pSmallJava;
	}
	
	public ParserRule getSmallJavaRule() {
		return getSmallJavaAccess().getRule();
	}

	//Attribute:
	//	name=ID;
	public AttributeElements getAttributeAccess() {
		return pAttribute;
	}
	
	public ParserRule getAttributeRule() {
		return getAttributeAccess().getRule();
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
