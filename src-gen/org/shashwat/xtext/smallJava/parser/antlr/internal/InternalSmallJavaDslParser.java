package org.shashwat.xtext.smallJava.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.shashwat.xtext.smallJava.services.SmallJavaDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSmallJavaDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'class'", "'extends'", "'{'", "'}'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_INT=5;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalSmallJavaDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSmallJavaDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSmallJavaDslParser.tokenNames; }
    public String getGrammarFileName() { return "../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g"; }



     	private SmallJavaDslGrammarAccess grammarAccess;
     	
        public InternalSmallJavaDslParser(TokenStream input, SmallJavaDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "SmallJava";	
       	}
       	
       	@Override
       	protected SmallJavaDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleSmallJava"
    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:67:1: entryRuleSmallJava returns [EObject current=null] : iv_ruleSmallJava= ruleSmallJava EOF ;
    public final EObject entryRuleSmallJava() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSmallJava = null;


        try {
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:68:2: (iv_ruleSmallJava= ruleSmallJava EOF )
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:69:2: iv_ruleSmallJava= ruleSmallJava EOF
            {
             newCompositeNode(grammarAccess.getSmallJavaRule()); 
            pushFollow(FOLLOW_ruleSmallJava_in_entryRuleSmallJava75);
            iv_ruleSmallJava=ruleSmallJava();

            state._fsp--;

             current =iv_ruleSmallJava; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSmallJava85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSmallJava"


    // $ANTLR start "ruleSmallJava"
    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:76:1: ruleSmallJava returns [EObject current=null] : (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' otherlv_5= '}' ) ;
    public final EObject ruleSmallJava() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:79:28: ( (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' otherlv_5= '}' ) )
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:80:1: (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' otherlv_5= '}' )
            {
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:80:1: (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' otherlv_5= '}' )
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:80:3: otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleSmallJava122); 

                	newLeafNode(otherlv_0, grammarAccess.getSmallJavaAccess().getClassKeyword_0());
                
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:84:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:85:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:85:1: (lv_name_1_0= RULE_ID )
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:86:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSmallJava139); 

            			newLeafNode(lv_name_1_0, grammarAccess.getSmallJavaAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSmallJavaRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleSmallJava156); 

                	newLeafNode(otherlv_2, grammarAccess.getSmallJavaAccess().getExtendsKeyword_2());
                
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:106:1: ( (otherlv_3= RULE_ID ) )
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:107:1: (otherlv_3= RULE_ID )
            {
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:107:1: (otherlv_3= RULE_ID )
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:108:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getSmallJavaRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSmallJava176); 

            		newLeafNode(otherlv_3, grammarAccess.getSmallJavaAccess().getParentSmallJavaCrossReference_3_0()); 
            	

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleSmallJava188); 

                	newLeafNode(otherlv_4, grammarAccess.getSmallJavaAccess().getLeftCurlyBracketKeyword_4());
                
            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleSmallJava200); 

                	newLeafNode(otherlv_5, grammarAccess.getSmallJavaAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSmallJava"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleSmallJava_in_entryRuleSmallJava75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSmallJava85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleSmallJava122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSmallJava139 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleSmallJava156 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSmallJava176 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleSmallJava188 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleSmallJava200 = new BitSet(new long[]{0x0000000000000002L});

}