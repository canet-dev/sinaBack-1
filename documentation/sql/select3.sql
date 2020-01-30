SELECT DISTINCT
	css.CSTS_DESCRIPTION
FROM
	SECU_USERS su
INNER JOIN SECU_PROF_ROLE_ACTIONS spra ON
	su.PROF_ID = spra.PROF_ID
INNER JOIN SECU_PROFESSIONAL_ROLES spr ON
	su.PROF_ID = spr.PROF_ID
INNER JOIN CONF_STATION_STRUCTURES css ON
	spra.SIAC_ID = css.SIAC_ID


WHERE
	su.USER_LOGIN = 'abernal'
	AND spr.USRO_FAVOURITE = TRUE

